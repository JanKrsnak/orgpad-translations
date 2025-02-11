(ns orgpad.client.i18n.dicts.en
  (:require [clojure.string :as str]
            [orgpad.common.i18n.dict.en :as en]))

(def dict
  "A dictionary map from keywords to the corresponding English texts."
  (merge
    en/dict
    {:administration/page-title                       "Administration - OrgPad"

     :attachments/allows-access-to-file               "Allows access to this file."
     :attachments/allows-access-to-image              "Allows access to this image."
     :attachments/no-preview                          "No preview available."
     :attachments/used-files                          "Files in OrgPage"
     :attachments/unused-files                        "Files on the side"
     :attachments/used-images                         "Images in OrgPage"
     :attachments/unused-images                       "Images on the side"
     :attachments/uploading-files                     "Uploading the files ..."

     :button/back                                     "Back"
     :button/cancel                                   "Cancel"
     :button/close                                    "Close"
     :button/copied                                   "Copied"
     :button/copy                                     "Copy"
     :button/copy-link                                "Copy link"
     :button/create                                   "Create"
     :button/create-tooltip                           "Create (Ctrl+Enter)"
     :button/delete                                   "Delete"
     :button/delete-selected                          "Delete selected"
     :button/documentation                            "Documentation"
     :button/download                                 "Download"
     :button/download-all                             "Download all"
     :button/drop                                     "Drop"
     :button/edit                                     "Edit"
     :button/import                                   "Import"
     :button/login                                    "Log in"
     :button/logout                                   "Log out"
     :button/publish                                  "Publish"
     :button/read                                     "Read"
     :button/register                                 "Register"
     :button/save                                     "Save changes"
     :button/save-tooltip                             "Save changes (Ctrl+Enter)"
     :button/upload                                   "Upload"
     :button/send                                     "Send"
     :button/present                                  "Present"
     :button/present-tooltip                          "Start presentation (F5)"
     :button/share                                    "Share"
     :button/exit                                     "Exit"
     :button/show-password                            "Show"
     :button/hide-password                            "Hide"

     :checkout/currency                               "Currency"
     :checkout/monthly                                "monthly"
     :checkout/yearly                                 "yearly (save 15%)"
     :checkout/failed-to-init                         "Something went wrong while loading checkout website."
     :checkout/upgrade-plan                           "Upgrade plan"
     :checkout/school-or-enterprise                   (fn [{:checkout/keys [school-url enterprise-url]}]
                                                        [:<> [:a.link-button {:href school-url} "School"] " or "
                                                         [:a.link-button {:href enterprise-url} "enterprise"] "? Contact us for a custom deal."])
     :checkout/pay-with-credit-card                   "Pay by card"
     :checkout/pay-with-wire-transfer                 "Pay by wire transfer"
     :checkout/promo-code                             "Promo code"
     :checkout/try-for-free                           "Try it for free"
     :checkout/activate-now                           "Activate now"
     :checkout/continue-for-free                      "Continue for free"

     :consent/title                                   "Usage of cookies in OrgPad"
     :consent/text                                    (fn [{:consent/keys [terms-and-conditions privacy-policy]}]
                                                        [:div.consent-text
                                                         "By using this site, you are agreeing with OrgPad's "
                                                         [:a.link-button terms-and-conditions "Terms and Conditions"]
                                                         " and "
                                                         [:a.link-button privacy-policy "Privacy policy"]
                                                         (str ". We employ the use of cookies to enable the functionality "
                                                              "of certain areas to make it easier for people using OrgPad.")])

     :dashboard/confirm-delete                        [:<> [:b "Permanently"] " delete this OrgPage?"]
     :dashboard/login-needed                          [:<> [:b "Log in"] " or " [:b "register"] " to create new OrgPages."]
     :dashboard/owned-orgpages                        "My OrgPages"
     :dashboard/public-orgpages                       "Published OrgPages"
     :dashboard/shared-orgpages                       "OrgPages shared with you"
     :dashboard/usergroup-orgpages                    "{usergroup/name}'s OrgPages"
     :dashboard/public-permission-edit                "Shared with everyone for editing"
     :dashboard/public-permission-view                "Shared with everyone for reading"
     :dashboard/create-public-orgpage                 "Create as public"
     :dashboard/leave-orgpage-as-public               "Leave as public"
     :dashboard/owner-reached-private-limit           "Owner reached limit"
     :dashboard/copy-as-public                        "Copy as public"
     :dashboard/copy-from-template-as-public          "Copy from template as public"

     :editors/create-page                             "Create another page"
     :editors/remove-page                             "Remove this page"
     :editors/previous-page                           "Previous page; hold SHIFT to move this page to the left"
     :editors/next-page                               "Next page; hold SHIFT to move this page to the right"
     :editors/title                                   "Title"
     :editors/switch-to-this-page                     (fn [{:render/keys [can-edit]}]
                                                        (str "Switch to this page"
                                                             (when can-edit "; hold SHIFT to move the current page there")))
     :editors/hidden-info                             "Click to write"

     :embedding-code/code                             "Code"
     :embedding-code/description                      "To embed this OrgPage into your website, insert the following code into your website:"

     :error/orgpage-access-denied                     "You do not have access to this OrgPage. Try to log in."
     :error/usergroup-access-denied                   "Permissions to edit the team denied."
     :error/already-member                            "“{usergroups/member}” is already a member."
     :error/administration-access                     "Administration access denied."
     :error/creation-unauthorized                     "Log in to create OrgPages."
     :error/deleting-denied                           "Deleting OrgPage denied."
     :error/email-already-used                        "Email already used."
     :error/email-not-registered                      "No account with this email."
     :error/email-missing-mx-record                   "No email server found at this domain."
     :error/email-invalid                             "Not an email."
     :error/error                                     "Error: "
     :error/safari-unsupported                        (str "Safari web browser is not supported at this point."
                                                           " Please use a different browser like Google Chrome,"
                                                           " Microsoft Edge, Vivaldi or Firefox.")
     :error/incorrect-orgpage-id                      (fn [{:orgpage/keys [id]}]
                                                        (str "Incorrect OrgPage" (when id " {orgpage/id}")
                                                             ". Wrongly copied link?"))
     :error/incorrect-link                            "Incorrect link. Either log in, or open the correct link."
     :error/incorrect-password                        "Incorrect password."
     :error/incorrect-profile-id                      "Incorrect link to profile. Wrongly copied link?"
     :error/lost-permission                           "Lost access to this OrgPage."
     :error/name-already-used                         "Name already used"
     :error/orgpage-removed                           (fn [{:orgpage/keys [title]}]
                                                        (str "The OrgPage " (when title "\"{orgpage/title}\"") " was removed."))
     :error/owner-of-orgpage                          "The person is already the owner of this OrgPage."
     :error/passwords-mismatch                        "Passwords do not match"
     :error/profile-not-found                         "Profile not found."
     :error/unknown-error                             "Unknown error, try again."
     :error/unknown-id                                "Unknown OrgPage."
     :error/unknown-login-or-email                    "Unknown email or team login."
     :error/unknown-user                              "“{usergroups/member}” does not exist."
     :error/unknown-usergroup                         "The team has been deleted"
     :error/upload-failed                             "Failed to upload the OrgPage: \"{orgpage/title}\""

     :feedback/ask-question                           "Ask a question"
     :feedback/hide-button                            "Hide button permanently"
     :feedback/dialog-title                           "Contact OrgPad Developers"
     :feedback/description                            [:<> "If you need help or have any problem, please let us - "
                                                       [:b "the developers of OrgPad"] " know. "
                                                       "Also, we welcome any ideas for improvement. "
                                                       "We will reply via email as soon as possible."]
     :feedback/languages                              "You can write us in English, Czech and German."
     :feedback/contact-when-problem-persists          [:<> " If the problem persists, contact us at "
                                                       [:a.link-button {:href "mailto:support@orgpad.com"} "support@orgpad.com"] "."]
     :feedback/wire-transfer-title                    (fn [{:feedback/keys [tier currency]}]
                                                        (str "Wire transfer"
                                                             (when currency
                                                               (str " in " (name currency))) " for "
                                                             "yearly"
                                                             (if (= tier "standard")
                                                               " Standard"
                                                               " Professional")
                                                             " plan"))
     :feedback/wire-transfer                          (fn [{:user/keys [email]}]
                                                        [:<> "Write us your " [:b "billing address"] ", any further information for the invoice."
                                                         " We will contact you shortly at your email address " [:b email] "."])
     :feedback/school-plan-title                      "I want to buy a plan for my school"
     :feedback/school-plan                            (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Let us know " [:b "how big is your school"]
                                                         ", how many teachers and students want to use OrgPad, and any further information."
                                                         " We will contact you shortly at your email address " [:b email]
                                                         ". Alternatively, you can call us at "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/enterprise-plan-title                  "I want to buy a plan for my company"
     :feedback/enterprise-plan                        (fn [{:user/keys     [email]
                                                            :feedback/keys [phone]}]
                                                        [:<> "Let us know " [:b "how big is your company"]
                                                         ", and how many people want to use OrgPad."
                                                         " Do you have any extra needs?"
                                                         " Do you need self hosting of OrgPad for an extra charge?"
                                                         " We will contact you shortly at your email address " [:b email]
                                                         ". Alternatively, you can call us at "
                                                         [:a.link-button {:href (str "tel:" (str/replace phone #" " ""))} phone] "."])
     :feedback/upgrade-subscription-title             "Upgrade my subscription to Professional plan"
     :feedback/upgrade-subscription                   (fn [{:user/keys [email]}]
                                                        [:<> "Write us how we should change your existing subscription and any further information."
                                                         " We will contact you shortly at your email address " [:b email] "."])
     :feedback/billing-period-title                   (fn [{:feedback/keys [period]}]
                                                        (str "Change my billing period to " (if (= period "yearly")
                                                                                              "yearly"
                                                                                              "monthly") " billing"))
     :feedback/billing-period                         (fn [{:user/keys [email]}]
                                                        [:<> "The change will happen after the current billing period finishes."
                                                         " There is a 15% discount when billed yearly."
                                                         " We will contact you shortly at your email address " [:b email] "."])

     :help-screen/units-with-shadows                  "Cells with shadows are opened and closed by a single click."
     :help-screen/flat-units                          "Flat cells have no extra content."

     :help-screen/more-pages                          "Multiple pages are indicated by circles at the bottom."
     :help-screen/click-title-to-close                "Clicking on title closes the cell immediately."
     :help-screen/click-content-next-page             "Clicking on content slides to the next page."
     :help-screen/click-bullet-goto-page              "Click on circles to jump to a page directly."

     :help-screen/create-links                        "Create links by dragging the connect button or clicking on it and then on the target."
     :help-screen/create-unit-by-dragging-link        "Creating a link into an empty space creates a new cell there."

     :help-screen/how-to-view                         "How to read"
     :help-screen/opening-units                       "Opening cells"
     :help-screen/moving-pages                        "Multiple pages"

     :help-screen/how-to-edit                         "How to edit"
     :help-screen/creating-links                      "Creating links"

     :help-screen/help                                "Help can be found here!"

     :info/uploading-attachments                      [:i18n/plural "Uploading {info/count} {info/num-files} ..."
                                                       {:info/num-files [:info/count "files" "file" "files"]}]
     :info/uploading-images                           [:i18n/plural "Uploading {info/count} {info/num-images} ..."
                                                       {:info/num-images [:info/count "images" "image" "images"]}]
     :info/uploading-images-failed                    [:i18n/plural "Failed to upload {info/count} {info/num-images}."
                                                       {:info/num-images [:info/count "images" "image" "images"]}]
     :info/uploading-attachments-failed               "Uploading files failed."
     :info/presentation-link-copied                   "The link for this presentation copied."
     :info/storage-exceeded                           "The owner of this OrgPage does not have {upload/total-size} left to upload these files."
     :info/attachments-too-large                      (str "Cannot upload {upload/total-size} in a single upload."
                                                           " The maximum size of all uploaded attachments is 500 MB.")

     :import/another-format                           [:<> "If you want to import your existing data in another format, contact us at "
                                                       [:b "support@orgpad.com"] "."]
     :import/dialog                                   "Import your data"
     :import/google-docs                              "To insert data from Microsoft Office or Google Docs, just paste them into an OrgPage."
     :import/supported-formats                        "Now we support these formats:"
     :import/lucidchart                               [:<> [:b "Lucidchart"] " exported as .vsdx file."]

     :lang/cs                                         "Czech"
     :lang/de                                         "German"
     :lang/en                                         "English"
     :lang/hi                                         "Hindi"
     :lang/pl                                         "Polish"
     :lang/ru                                         "Russian"

     :language-select/lang-tooltip                    (fn [{:language-select/keys [lang-name lang-en-name]}]
                                                        (str lang-name (when lang-en-name (str " (" lang-en-name ")"))))

     :limit/of                                        " of "
     :limit/orgpages                                  " OrgPages"
     :limit/people                                    " people"
     :limit/teams                                     " teams"
     :limit/team-members                              " members"
     :limit/orgpages-tooltip                          (str "In Free tier, the number of OrgPages is limited."
                                                           " Upgrade your plan to create more OrgPages.")
     :limit/shares-tooltip                            (str "The number of people you can share this OrgPage directly is limited."
                                                           " Upgrade to Professional tier to share with unlimited number of people.")
     :limit/teams-tooltip                             (str "In Standard tier, the number of owned teams is limited."
                                                           " Upgrade to Professional tier to create unlimited teams.")
     :limit/teams-members-tooltip                     (str "In Standard tier, each team has a limited number of members."
                                                           " Upgrade to Professional tier to create unlimited teams.")
     :limit/attachments-size                          (str "The total size of all uploaded files and images is limited,"
                                                           " and can be increased by upgrading the plan.")
     :limit/attachments-size-clickable                (str "The total size of all uploaded files and images is limited."
                                                           " Click to increase your limit by upgrading the plan.")

     :limits/max-orgpages                             "documents"
     :limits/max-storage                              "storage"
     :limits/max-teams                                "teams"
     :limits/of                                       " of"
     :limits/max-team-members                         "members"
     :limits/priority-support                         "priority support"

     :link-panel/flip                                 "Flip the direction"
     :link-panel/insert-unit-in-middle                "Insert a cell in the middle"
     :link-panel/delete                               "Delete the link"
     :link-panel/change-link-style                    "Change style of this link; hold SHIFT to set the current, hold CTRL to copy to the default"

     :loading/initial-autoresize                      "Computing sizes of all cells, {loading/num-units} remaining ..."
     :loading/initial-layout                          "Improving the initial layout ..."
     :loading/restoring-opened-pages                  "Restoring position of opened pages ..."
     :loading/getting-orgpage                         "Downloading an OrgPage from the server ..."
     :loading/getting-dashboard                       "Downloading the list of available OrgPages from the server ..."
     :loading/uploading-orgpage                       "Uploading an OrgPage to the server ..."
     :loading/authorizing-user                        "Authorizing the user ..."
     :loading/ws-init                                 "Setting up connection to the server ..."
     :loading/ws-closed                               "Connection to server closed, trying to reconnect. If the problem persists, reload the page."
     :loading/administration                          "Loading administration data ..."
     :loading/profile                                 "Loading profile ..."
     :loading/style                                   "Loading styles ..."
     ;; Needed?
     :loading/start-trial                             "Starting 7-day trial subscription..."
     :loading/uploading-attachments                   "Uploading attachments to the server ..."

     :login/continue-with-facebook                    "Continue with Facebook"
     :login/continue-with-google                      "Continue with Google"
     :login/forgotten-password                        "Forgotten password"
     :login/forgotten-password-email-resent           "Password reset email sent already."
     :login/forgotten-password-description            "Enter an email address for which we will send you a link to reset your password. This link is valid for 24 hours."
     :login/forgotten-password-error                  [:<> "This email address is blocked by you. Either unblock it by clicking Unsubscribe in any email from OrgPad, or send us an email to "
                                                       [:b "support@orgpad.com"]
                                                       " from this email address."]
     :login/remember                                  "Remember"
     :login/remember-tooltip                          "Keep logged in when returning to this site."
     :login/send-reset-link                           "Send reset link"
     :login/wrong-email-or-password                   "Email or password is incorrect."

     :login-util/separator                            "or"

     :notes/create-note                               "New note"
     :notes/edit-note                                 "Edit a note"
     :notes/manage-notes                              "Manage notes"
     :notes/my-notes                                  "My notes"
     :notes/notes                                     [:i18n/plural "{notes/num-notes} {notes/notes-label}"
                                                       {:notes/notes-label [:notes/num-notes
                                                                            "notes" "note" "notes"]}]
     :notes/confirm-delete                            "Delete this note?"
     :notes/notes-description                         "Capture your ideas and sort them later."

     :notifications/info                              "Pick which emails OrgPad sends to you. We'll always let you know about important changes."
     :notifications/any-email                         "Any email from OrgPad"
     :notifications/email-verification                "Email verification when registered, links for resetting password and essential payment information"
     :notifications/monthly-newsletter                "Monthly newsletter with updates and recent development in OrgPad"
     :notifications/messages                          "Receive messages from other people"
     :notifications/blocked-people                    "Specifically blocked people:"
     :notifications/receipts                          "Receipts when your subscription is automatically renewed"
     :notifications/receive-invitations               "Receive invitations from other people"
     :notifications/unblock-user                      "Unblock this person"

     :onboarding/openable-units                       "Only elevated cells with shadows can be opened."

     :orgpage/change-information                      "Change information"
     :orgpage/copy-orgpage                            "Copy into a new OrgPage"
     :orgpage/delete-orgpage                          "Delete OrgPage"
     :orgpage/detail                                  "Detail"
     :orgpage/meta-description                        "Description"
     :orgpage/meta-new-tag                            "Tag"
     :orgpage/meta-info                               (str "Information below helps you and others to know what this OrgPage is about. "
                                                           "You can filter by tags in the OrgPages list.")
     :orgpage/meta-info-in-share-orgpage              "Before sharing this OrgPage, title has to be set."
     :orgpage/share-tooltip                           "Share this OrgPage with others"
     :orgpage/share-orgpage                           "Share OrgPage"
     :orgpage/show-information                        "Show information"

     :orgpage/zoom-in                                 "Zoom in"
     :orgpage/zoom-out                                "Zoom out"
     :orgpage/create-unit-double-click                "Double click to create a cell."
     :orgpage/switch-to-edit                          "Switch to edit."

     :orgpage/untitled                                "Untitled OrgPage"
     :orgpage/untitled-unit                           "Untitled cell"
     :orgpage/path-num-steps                          [:i18n/plural "{orgpage/num-steps} {orgpage/step-label}"
                                                       {:orgpage/step-label [:orgpage/num-steps
                                                                             "steps" "step" "steps"]}]

     :orgpage/page-titles                             (fn [{:orgpage/keys [num-pages]}]
                                                        (str "{orgpage/title}"
                                                             (when (> num-pages 1) " (page {orgpage/position})")))
     :orgpage/path-title-closed-opened-index          "{orgpage/title} (page {orgpage/closed-index} → {orgpage/opened-index})"

     :orgpage-stats/number-of-units                   "Number of cells"
     :orgpage-stats/number-of-links                   "Number of links"
     :orgpage-stats/number-of-files                   "Number of files"
     :orgpage-stats/number-of-images                  "Number of images"

     :org-role/student                                "Student"
     :org-role/teacher                                "Teacher"
     :org-role/employee                               "Employee"
     :org-role/admin                                  "Administrator"

     :panel/mobile-limitations                        [:<> "Creating or editing OrgPages is " [:b "not yet possible"] " at mobile. We are addressing this in an upcoming version, please use desktop at this moment."]
     :panel/create-orgpage                            "New OrgPage"
     :panel/logo-tooltip                              "Go home"
     :panel/edit-info                                 "Switch to editing where you can create and delete cells and links, modify content, and more"
     :panel/read-info                                 "Switch to reading where nothing can be changed but browsing the content is easier"
     :panel/undo-deletion                             "Undo deletion"
     :panel/undo-deletion-info                        [:i18n/plural "Revert the deletion of {delete/num-units} {delete/unit-label} and {delete/num-links} {delete/link-label}."
                                                       #:delete{:unit-label [:delete/num-units
                                                                             "cells" "cell" "cells"]
                                                                :link-label [:delete/num-links
                                                                             "links" "link" "links"]}]

     :panel/switch-style                              "Switch style of new cells and links; drag to create a new cell"
     :panel/profile                                   "Profile"
     :panel/settings                                  "Settings"
     :panel/usergroups                                "Teams"
     :panel/stats                                     "Stats"
     :panel/administration                            "Administration"

     :password/too-short                              "At least 8 characters required"
     :password/different-passwords                    "Passwords do not match"

     :password-reset/back-to-list                     "Back to list"
     :password-reset/change-password                  "Change password"
     :password-reset/set-password                     "Set password"
     :password-reset/has-password                     "Your account has a password set."
     :password-reset/without-password                 "No password is yet set since linked accounts were used for login."
     :password-reset/invalid-link                     "Invalid link, maybe older than 24 hours. Please ask to resend the email."
     :password-reset/description                      "Set your new password."
     :password-reset/enter-current-and-new-password   "Enter the current password and twice the new password."
     :password-reset/enter-new-password-twice         "Enter the new password twice."

     :pending-activation/email-already-used           "Email already used on another account."
     :pending-activation/email-not-recieved           "Haven't received the activation email? Click the button below. You can even modify your email address."
     :pending-activation/email-sent                   "Activation email sent. "
     :pending-activation/instructions                 "For security reasons we have to verify your email first. Click the activation link in an email we sent you."
     :pending-activation/resend                       "Resend activation email"

     :path/add-step                                   "Add a step"
     :path/title                                      "Presentation {path/num-paths}"
     :paths/create-new-path                           "Create a presentation"
     :paths/confirm-path-deletion                     (fn [{:path/keys [title]}]
                                                        [:<> "Delete the presentation " [:b title] "?"])
     :paths/show-hidden-units                         "Show hidden cells"

     :payments/current-subscription                   (fn [{:subscription/keys [tier end-date autorenewal]}]
                                                        [:<> "Currently in " [:b tier " plan"] ", valid till " [:b end-date] "."
                                                         (if autorenewal
                                                           " Subscription will be automatically renewed at the end of the payment period."
                                                           " Subscription will expire at the end of the payment period.")])
     :payments/current-org-subscription               (fn [{:org/keys [tier role name]}]
                                                        [:<> [:b role] " at " [:b tier " plan"] " of " name "."])
     :payments/free-tier-info                         [:<> "OrgPad used in " [:b "Free tier,"] " without any payments."]
     :payments/no-teams                               "No teams in Free tier."
     :payments/upgrade-info                           (fn [{:payments/keys [upgrade-url period-url]}]
                                                        [:<> "For " (when upgrade-url [:<> [:a.link-button {:href upgrade-url} "upgrades"]] " or ")
                                                         [:a.link-button {:href period-url} "changing your billing period"]
                                                         ", contact us."])
     :payments/choose-plan                            "Choose plan"
     :payments/manage-plan                            "Manage plan"
     :payments/contact-to-manage                      (fn [{:payments/keys [url]}]
                                                        [:<> "Contact us to "
                                                         [:a.link-button {:href url} "to manage your subscription"] "."])
     :payments/receipts                               "Receipts:"
     :payments/receipt-label                          "Receipt {receipt/date-range}"
     :payments/customer-portal-failed                 "Something went wrong while loading plan management website."

     :presentation/presentation                       "Presentation"
     :presentation/step                               "Step"
     :presentation/first-step                         "The first step"
     :presentation/previous-step                      "The previous step"
     :presentation/next-step                          "The next step"
     :presentation/last-step                          "The last step"
     :presentation/present                            "Start presentation"
     :presentation/exit-tooltip                       "Exit presentation"

     :presentation/share-presentation                 "Share this presentation with others."

     :presentation/embedded-zoom-info                 "CTRL + scroll for zooming"

     :paths-menu/focus                                "Set camera {keyboard/shortcut}"
     :paths-menu/open-and-close                       "Open and close cells {keyboard/shortcut}"
     :paths-menu/visibility                           "Change visibility {keyboard/shortcut}"

     :pricing-popup/orgpages-exceeded-title           "You cannot create more OrgPages in Free plan"
     :pricing-popup/orgpages-exceeded                 "You have to upgrade your plan."
     :pricing-popup/storage-exceeded-title            "Not enough space left to upload {upload/total-size}"
     :pricing-popup/storage-exceeded                  (fn [{:upload/keys [space-left]}]
                                                        [:<> "Only " [:b space-left " remain"] " in your storage."
                                                         " You can upgrade your plan to extend your storage."])
     :pricing-popup/num-shared-limit-reached-title    "You cannot share this OrgPage with more people"
     :pricing-popup/num-shared-limit-reached-common   "The maximum number of people sharing this OrgPage was reached."
     :pricing-popup/num-shared-limit-reached          [:<> " To add more people, you have to upgrade to "
                                                       [:b "Professional tier"] "."]
     :pricing-popup/num-shared-limit-reached-owner    (fn [{:orgpage/keys [owner]}]
                                                        [:<> " The owner of this OrgPage " owner " has to upgrade to "
                                                         [:b "Professional tier"] " to add more people."])
     :pricing-popup/enable-teams-title                "Upgrade your plan to manage teams"
     :pricing-popup/enable-teams                      [:<> "Teams group people together which simplifies collaboration and sharing OrgPages."
                                                       " This feature is only enabled in " [:b "Standard tier"] " or higher."]
     :pricing-popup/teams-limit-reached-title         "Upgrade your plan to create more teams"
     :pricing-popup/teams-limit-reached               "The limit for the number of teams was reached for your plan."
     :pricing-popup/team-members-limit-reached-title  "You cannot add more members to {usergroup/name}"
     :pricing-popup/team-members-limit-reached-common "The maximum number of team members was reached."
     :pricing-popup/team-members-limit-reached        [:<> " To add more members, you have to upgrade to "
                                                       [:b "Professional tier"] "."]
     :pricing-popup/team-members-limit-reached-owner  (fn [{:usergroup/keys [owner]}]
                                                        [:<> " The owner of this team " owner " has to upgrade to "
                                                         [:b "Professional tier"] " to add more members."])

     :profile/open-contact-dialog                     "Send message"
     :profile/contact-dialog-title                    (fn [{:profile/keys [first-name last-name]}]
                                                        (if (or (not (str/blank? first-name))
                                                                (not (str/blank? last-name)))
                                                          (str "Contact " first-name " " last-name)
                                                          "Contact this person"))
     :profile/contact-dialog-info                     (str "Since we do not share the email addresses of other people in OrgPad, we will send this message for you. We will"
                                                           " include your name and email to provide a direct contact.")

     :promotion/unknown                               "Unknown code"
     :promotion/max-usages-reached                    "Used too many times"
     :promotion/expired                               "Expired"
     :promotion/one-year-free                         "1 year free"
     :promotion/for-one-year                          " for 1 year"
     :promotion/for-six-months                        " for 6 months"

     :props/h1                                        "Large title"
     :props/h2                                        "Medium title"
     :props/h3                                        "Small title"
     :props/weight-none                               "Normal link"
     :props/strong                                    "Strong link"
     :props/arrowhead-none                            "No arrow"
     :props/single                                    "Arrow"
     :props/double                                    "Double arrow"

     :public-permission/none                          "private."
     :public-permission/edit                          "shared with everyone for editing."
     :public-permission/view                          "shared with everyone for reading."

     :registration/create-user                        "Create account"
     :registration/register-by-email                  "Register by email"
     :registration/server-error                       "Server error. Try creating the account again."
     :registration/missing-email                      "{registration/service} did not let us know your email. Please fill it out below."

     :selection/change-style-of-selected              [:i18n/plural (fn [{:selection/keys [type]}]
                                                                      (str "Change style of selected "
                                                                           (case type
                                                                             :style-select/all-props (str "{selection/num-units} {selection/unit-label} a "
                                                                                                          "{selection/num-links} {selection/link-label}")
                                                                             :style-select/unit-props "{selection/num-units} {selection/unit-label}"
                                                                             :style-select/link-props "{selection/num-links} {selection/link-label}")
                                                                           "; hold SHIFT to set the current, hold CTRL to copy to the current"))
                                                       #:selection{:unit-label [:selection/num-units
                                                                                "cells" "cell" "cells"]
                                                                   :link-label [:selection/num-links
                                                                                "links" "link" "links"]}]

     :selection/link                                  "Connect cells"
     :selection/hide-contents                         "Hide contents"
     :selection/show-contents                         "Show contents"
     :selection/copy-units-links                      "Copy cells and links"
     :selection/flip-links                            "Flip link directions"
     :selection/delete                                "Delete selected"

     :settings/profile                                "Profile"
     :settings/payments                               "Payments"
     :settings/account                                "Account"
     :settings/linked-accounts                        "Linked accounts"
     :settings/notifications                          "Notifications"
     :settings/account-description                    "Change your email, password or delete your account."
     :settings/stats-description                      "Here are some statistics about your OrgPad usage."
     :settings/change-email                           "Change email"
     :settings/change-email-text                      "Enter new email address. For security reasons, we have to verify it before unlocking the account."
     :settings/current-email                          (fn [{:settings/keys [email]}]
                                                        [:<> "Your account is registered with the email " [:b email] " ."])
     :settings/account-linked-to-facebook             [:<> "Your account is " [:b " linked "] " to Facebook."]
     :settings/account-not-linked-to-facebook         [:<> "Your account is " [:b " not linked "] " to Facebook."]
     :settings/link-fb                                "Link Facebook"
     :settings/unlink-fb                              "Unlink Facebook"
     :settings/account-linked-to-google               [:<> " Your account is " [:b " linked "] " to Google."]
     :settings/account-not-linked-to-google           [:<> " Your account is " [:b " not linked "] " to Google."]
     :settings/link-google                            "Link Google"
     :settings/unlink-google                          "Unlink Google"
     :settings/set-password-text                      " Set password before unlinking."
     :settings/linked-accounts-info                   "Link your Facebook or Google account to OrgPad so you can use them to log in."
     :settings/profile-info                           "People will recognise you on OrgPad with the info below."
     :settings/select-language                        "Language of the app (Ctrl+Shift+L): "

     :settings/delete-account                         "Delete account"
     :settings/confirm-delete-account-question        [:<> [:b "Permanently"] " delete your account?"]
     :settings/confirm-delete-account-info            "It will delete all your OrgPages and their data."
     :settings/delete-account-info                    [:<> "Deleting will " [:b "permanently"] " delete all your OrgPages and their data."]

     :share-orgpage/campaigns                         "Campaigns"
     :share-orgpage/copy-template-link                "Copy template link"
     :share-orgpage/copy-template-link-tooltip        "People can use this link to create their own copies of this OrgPage"
     :share-orgpage/dialog-title                      "Share {orgpage/title}"
     :share-orgpage/info                              (fn [{:share/keys [create-team]}]
                                                        [:<> (str "People without an OrgPad account will get an invitation with a link."
                                                                  " After they open the link, they can read this OrgPage. ")
                                                         [:a.link-button create-team "Create a team"]
                                                         " to easily share OrgPages with a group of people."])
     :share-orgpage/invite-for-editing                "Invite for editing"
     :share-orgpage/invite-for-viewing                "Invite for reading"
     :share-orgpage/invite-by-email                   "Do you want to invite them by email using a specific language?"
     :share-orgpage/links                             "Links"
     :share-orgpage/to-read                           "to read"
     :share-orgpage/to-edit                           "to edit"
     :share-orgpage/links-tooltip                     "Grant access via shareable links"
     :share-orgpage/new-user-or-usergroup             "Name, email or team"
     :share-orgpage/link-permission-start             "Allow people"
     :share-orgpage/link-permission-end               "this OrgPage."
     :share-orgpage/private-info                      "Only you and the people with whom you have shared the OrgPage directly or through a link have access. Every newly created document is private."
     :share-orgpage/publish-for-editing-info          "The OrgPage is public. Anyone on the Internet can search and edit it."
     :share-orgpage/publish-for-reading-info          "The OrgPage is public. Anyone on the Internet can search and read it. Only you or the people with whom you have shared the OrgPage for editing can make changes."
     :share-orgpage/publish-permission-end            "This OrgPage is "
     :share-orgpage/publish                           "Publish"
     :share-orgpage/publish-confirmation              "Everyone will be able {orgpage/permission} this OrgPage. Are you sure?"
     :share-orgpage/publish-tooltip                   "Grant access to everyone"
     :share-orgpage/remove-user                       "Remove permission"
     :share-orgpage/reset-links                       (fn [{:share/keys [reset-links]}]
                                                        [:<> "If you shared a link by accident, you can "
                                                         [:span.link-button reset-links "invalidate all previous links"]
                                                         "."])
     :share-orgpage/shareable-link                    "Shareable link"
     :share-orgpage/show-embedding-code               "Embed into your website"
     :share-orgpage/start-with-presentation           "Start with a presentation."
     :share-orgpage/user-not-registered               " is not yet registered at OrgPad."
     :share-orgpage/users                             "People"
     :share-orgpage/users-tooltip                     "Grant access to individual people"

     :side-panel/about                                "About"
     :side-panel/files-and-images                     "Files and images"
     :side-panel/paths                                "Presentations"
     :side-panel/translate                            "Translate"
     :side-panel/help                                 "Help"
     :side-panel/home                                 "Home"
     :side-panel/import                               "Import"
     :side-panel/share                                "Share"
     :side-panel/num-files                            [:i18n/plural "{side-panel/num-files} {side-panel/files-label}"
                                                       {:side-panel/files-label [:side-panel/num-files
                                                                                 "files" "file" "files"]}]
     :side-panel/num-images                           [:i18n/plural "{side-panel/num-images} {side-panel/images-label}"
                                                       {:side-panel/images-label [:side-panel/num-images
                                                                                  "images" "image" "images"]}]
     :side-panel/num-paths                            [:i18n/plural " {side-panel/num-paths} {side-panel/paths-label}"
                                                       {:side-panel/paths-label [:side-panel/num-paths
                                                                                 " paths " " path " " paths "]}]

     :step/closed-pages                               "Closed pages"
     :step/everything-closed                          "Everything closed."
     :step/hidden-units                               "Hidden cells"
     :step/nothing-changed                            "Nothing changed."
     :step/opened-pages                               "Opened pages"
     :step/pages-shown-in-the-camera                  "Pages shown in camera"
     :step/revealed-units                             "Revealed cells"
     :step/switched-pages                             "Switched pages"

     :tag/public                                      "public"

     :text-field/email                                "Email"
     :text-field/first-name                           "First name"
     :text-field/last-name                            "Last name"
     :text-field/new-password                         "New password"
     :text-field/new-password-again                   "New password again"
     :text-field/password                             "Password"
     :text-field/password-again                       "Password again"
     :text-field/title                                "Title"
     :text-field/content                              "Content"
     :text-field/name-or-email                        "Name or email"
     :text-field/subject                              "Subject"
     :text-field/message                              "Message"

     :tier/free                                       "Free"
     :tier/standard                                   "Standard"
     :tier/professional                               "Professional"
     :tier/school                                     "School"
     :tier/enterprise                                 "Enterprise"
     :tier/unlimited                                  "Unlimited"

     :translate/title                                 "Translate OrgPage {orgpage/title} into another language"
     :translate/info                                  (str "Automatically creates a copy of this OrgPage owned by you"
                                                           " which is translated from the source language to the target"
                                                           " language. You can find it in your list within a minute.")
     :translate/source-lang                           "Source language"
     :translate/target-lang                           "Target language"
     :translate/translate                             "Translate"
     :translate/done                                  (fn [{:orgpage/keys [title url]}]
                                                        [:<> "Translation available as "
                                                         [:a.link-button {:href   url
                                                                          :target "_blank"} title]])

     :role/owner                                      "Owner"
     :role/admin                                      "Can share and delete"
     :role/edit                                       "Can edit"
     :role/view                                       "Can read"
     :role/member                                     "Member"

     :unit-panel/create-link                          "Click or drag to connect; hold SHIFT to create multiple connections"
     :unit-panel/change-link-style                    (str "Change style of this cell; "
                                                           "hold SHIFT to set the current, "
                                                           "hold CTRL to copy to the default; "
                                                           "drag to connect in this style")
     :unit-panel/hide-content                         "Hide content"
     :unit-panel/delete-unit                          "Delete cell"

     :usergroups/create-team                          "Create a team"
     :usergroups/info                                 "Create and manage teams of your friends and coworkers to simplify sharing OrgPages."
     :usergroups/delete-usergroup                     "Delete team"
     :usergroups/members                              "Members"
     :usergroups/change                               "Change team title and logo"
     :usergroups/show-actions                         "Show actions"
     :usergroups/name                                 "Name"
     :usergroups/create-usegroup-info                 (str "The team name and profile picture can be seen by anyone on OrgPad. "
                                                           "Choose a name at least 5 characters long. "
                                                           "Leading and trailing space characters will be removed.")
     :usergroups/confirm-delete-usergroup             [:<> [:b "Permanently"] " delete this team?"]
     :usergroups/usergroups-members                   "{usergroup/name}'s members"
     :usergroups/remove-member                        "Remove from team"
     :usergroups/remove-admin                         "Remove admin"
     :usergroups/make-admin                           "Make admin"
     :usergroups/admin-tooltip                        "An admin can manage the members and delete the team."
     :usergroups/untitled-usergroup                   "Untitled team"

     :wire-transfer/title                             "Wire Transfer for yearly {wire-transfer/tier} plan"
     :wire-transfer/info                              "We will activate your yearly subscription when we recieve your money at our account."
     :wire-transfer/used-currency                     "Payment in {wire-transfer/currency}"
     :wire-transfer/recipient-name                    "Recipient name"
     :wire-transfer/account-number                    "Account number"
     :wire-transfer/iban                              "IBAN"
     :wire-transfer/bic-swift                         "BIC/SWIFT"
     :wire-transfer/amount                            "Amount"
     :wire-transfer/payment-purpose                   "Payment purpose"
     :wire-transfer/qr-code-common                    (str "Scan this payment QR code with your banking app to fill"
                                                           " out the correct information automatically.")
     :wire-transfer/cz-sk-qr-code-description         (str " This is a QR code commonly used for wire transfers"
                                                           " in Czechia and Slovakia.")
     :wire-transfer/eu-qr-code-description            (str " This is a QR code commonly used for SEPA transfers"
                                                           " in the European Union.")
     :wire-transfer/trial-info                        (str "You can start a one-time 7-day subscription to use OrgPad"
                                                           " fully immediatelly. When the bank confirms the payment"
                                                           " succeeded, the subscription period will be extended"
                                                           " by 1 year.")
     :wire-transfer/feedback                          (fn [{:wire-transfer/keys [url]}]
                                                        [:<> " If you have any questions or difficulties, please let us"
                                                         " know by " [:a.link-button {:href url} "filling out this form"] "."])
     :wire-transfer/success-text                      [:<> "We have activated a " [:b "one-time 7-day subscription"]
                                                       " so you can use OrgPad with the new plan immediatelly. "]
     :wire-transfer/common-result-text                (str "When the bank confirms the payment succeeded,"
                                                           " the subscription period will be extended"
                                                           " by 1 year.")
     :wire-transfer/start-trial                       "Wire transfer sent"
     :wire-transfer/start-trial-result-title          "Thank you for the payment"
     :wire-transfer/copy                              "Copy to clipboard"
     }))